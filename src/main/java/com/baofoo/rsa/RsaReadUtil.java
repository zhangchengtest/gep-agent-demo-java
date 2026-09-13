package com.baofoo.rsa;

import java.io.*;
import java.security.*;
import java.security.cert.Certificate;
import java.security.cert.CertificateFactory;
import java.util.Base64;
import java.util.Enumeration;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * <b>公私钥读取工具</b><br>
 * <br>
 *
 * @author 行者
 * @version 4.1.0
 */
public final class RsaReadUtil {

	private static final Logger logger = Logger.getLogger(RsaReadUtil.class.getName());

    public static PublicKey getPublicKeyFromFile(String pubCerPath) {
        try (FileInputStream pubKeyStream = new FileInputStream(pubCerPath)) {
            byte[] reads = new byte[pubKeyStream.available()];
            pubKeyStream.read(reads);
            return getPublicKeyByText(new String(reads));
        } catch (IOException e) {
            logger.log(Level.SEVERE, "Error while reading public key from file", e);
        }
        return null;
    }

    public static PublicKey getPublicKeyByText(String pubKeyText) {
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X509");
            BufferedReader br = new BufferedReader(new StringReader(pubKeyText));
            String line = null;
            StringBuilder keyBuffer = new StringBuilder();
            while ((line = br.readLine()) != null) {
                if (!line.startsWith("-")) {
                    keyBuffer.append(line);
                }
            }
            Certificate certificate = certificateFactory.generateCertificate(new ByteArrayInputStream(Base64.getDecoder().decode(keyBuffer.toString())));
            return certificate.getPublicKey();
        } catch (Exception e) {
            logger.log(Level.SEVERE, "Error while reading public key from text", e);
        }
        return null;
    }

    public static PrivateKey getPrivateKeyFromFile(String pfxpath, String priKeyPass) {
        try (FileInputStream priKeyStream = new FileInputStream(pfxpath)) {
            byte[] reads = new byte[priKeyStream.available()];
            priKeyStream.read(reads);
            return getPrivateKeyByStream(reads, priKeyPass);
        } catch (IOException e) {
            logger.log(Level.SEVERE, "Error while reading private key from file", e);
        }
        return null;
    }

    public static PrivateKey getPrivateKeyByStream(byte[] pfxBytes, String priKeyPass) {
        try {
            KeyStore ks = KeyStore.getInstance("PKCS12");
            char[] charPriKeyPass = priKeyPass.toCharArray();
            ks.load(new ByteArrayInputStream(pfxBytes), charPriKeyPass);
            Enumeration<String> aliasEnum = ks.aliases();
            String keyAlias = null;
            if (aliasEnum.hasMoreElements()) {
                keyAlias = (String) aliasEnum.nextElement();
            }
            return (PrivateKey) ks.getKey(keyAlias, charPriKeyPass);
        } catch (Exception e) {
            logger.log(Level.SEVERE, "Error while reading private key from stream", e);
        }
        return null;
    }
}
