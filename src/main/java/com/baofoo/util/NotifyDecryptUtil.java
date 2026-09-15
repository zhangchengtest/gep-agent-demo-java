package com.baofoo.util;

import com.baofoo.rsa.RsaCodingUtil;

/**
 * 异步通知 dataContent 解密工具。
 * <p>
 * 解密流程：RSA 公钥解密（Hex）→ Base64 解码 → 明文 JSON。
 * 与 {@link com.baofoo.demo.NotifyServlet} 处理逻辑一致。
 */
public class NotifyDecryptUtil {

    private NotifyDecryptUtil() {
    }

    /**
     * 使用默认公钥证书解密通知密文。
     *
     * @param dataContent 通知参数 dataContent（Hex 密文）
     * @return 明文 JSON；解密失败返回 null
     */
    public static String decrypt(String dataContent) {
        return decrypt(dataContent, GepUtils.cerpath);
    }

    /**
     * 使用指定公钥证书解密通知密文。
     *
     * @param dataContent 通知参数 dataContent（Hex 密文）
     * @param pubCerPath  平台公钥 cer 路径
     * @return 明文 JSON；解密失败返回 null
     */
    public static String decrypt(String dataContent, String pubCerPath) {
        if (dataContent == null || dataContent.trim().isEmpty()) {
            return null;
        }
        try {
            String rsaPlain = RsaCodingUtil.decryptByPubCerFile(dataContent.trim(), pubCerPath);
            if (rsaPlain == null) {
                GepUtils.log("RSA 公钥解密失败，请检查密文或证书路径：" + pubCerPath);
                return null;
            }
            return SecurityUtil.Base64Decode(rsaPlain);
        } catch (Exception e) {
            GepUtils.log("dataContent 解密异常：" + e.getMessage());
            e.printStackTrace();
            return null;
        }
    }

    /**
     * 本地快速验证通知密文解密。
     */
    public static void main(String[] args) {
        String dataContent = args != null && args.length > 0 ? args[0]
                : "9e8d4966ee2552caf84cc5b1106b00f0c9e05769ad3200db9b2ead40cc736da2365808b48f02f568e85d9c48ce9330cbdf48f94c3a99b744ba9be22c20b0c69d78234e5f1a7a05405b5ff73950695016d310acb061ceb6151dbb362ca146da9d8e8f39bfd6ee247e5471be4095bae605a2482cc4e2e9d6df4057766754413ba4107078813170f5e736f7ff9792b9ea2f57605b91613b33e30a2b1b0de56e649e16e7a09f751244fd05223563025e22b3d3348d3eb6518ae56ca8bb211392c78b57e79a16c40d43dc84525c45786d29b35f5576f55b33643070b588dc9689cfb151b9d362892d69370045c84f88c5539f99d2f7889e8098fed249a3f056d4ed9c205b0201f08f45e18fb2924c6622c0ec6582e2fd861ddc4d0a1e0c1c40fc151eca54b54a69ff00efb2bc7c6671eb92b84acfb5f7ca7a47a038056315bad131295bc89ba20aafcdf308478a3be62674428033a9474f6f520e42d6e648ba62b0d605745815ca672dfcd30f67cd2999be5de4cc5ed8a60b45c6ce058486a29ead6da721833272ec60b7106b7bf402e8af364d7e915fd097c8e6f3eded8f68d9fdab7804bc339405a07ecdc1c2207492409b037d0ce4548271b2b4fc5c71a4aa2dfcaffe3b7ee53e0870d97c4f2147aa0965e6c030395c407f59ab345ab61f6307dcb8765db27edd691ecdbfb939cbdc3b74c0502a4087a82dd6a5f83c075ce5269e1aa49fae80733cc11e13daf32329d173e67568071edcec62f41b2f295a3c67be42fe8a0520921ddba66899cf930838f120e7b559f7913ad34995e10a31380122350a214b719c85e25d3ba3ca8c26b0bee70a03cac7c14039bd385386220b721773580aaaafe986569df4a3dd625516ca0e36acc988609e140cefb9666e614811";

        GepUtils.log("cerpath=" + GepUtils.cerpath);
        String plain = decrypt(dataContent);
        GepUtils.log("解密结果：" + plain);
    }
}
