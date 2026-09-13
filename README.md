## 免责申明
此DEMO仅供学习参考使用，实际开发中需要结合具体业务场景编写您的项目。

## DEMO运行环境
- JDK 1.8 及以上
- Maven 3.6 及以上

### 构建与运行
```bash
# 编译打包
mvn clean package

# 生成的 war 包位于 target/gep-agent-demo-java.war，可部署到 Tomcat 等 Servlet 容器
```

各 `demo` 包下的接口测试类带有 `main` 方法，可在 IDE 中直接运行（请先在项目根目录执行 `mvn compile`，或由 IDE 导入为 Maven 项目）。

### 代码简要说明
	gep-agent-demo-java	代理商对接DEMO（Maven）
		├── pom.xml
		├── src/main/java/com/baofoo
		│	├── demo	接口测试的main方法类
		│	│	├── agent	客户入网API接口测试类
		│	│	├── b2b	E贸汇API接口测试类
		│	│	├── exchange	代理商-GEP兑换分发API接口测试类
		│	│	├── store	代理商-收款账户 API接口测试类
		│	│	└── NotifyServlet	异步通知Servlet
		│	├── rsa	rsa证书读取和加解密工具类
		│	└── util	常用工具类
		├── src/main/webapp/file	文件及证书等
		└── README.md	项目须知
