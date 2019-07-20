package com.alipay.config;

import java.io.FileWriter;
import java.io.IOException;

/* *
 *类名：AlipayConfig
 *功能：基础配置类
 *详细：设置帐户有关信息及返回路径
 *修改日期：2017-04-05
 *说明：
 *以下代码只是为了方便商户测试而提供的样例代码，商户可以根据自己网站的需要，按照技术文档编写,并非一定要使用该代码。
 *该代码仅供学习和研究支付宝接口使用，只是提供一个参考。
 */

public class AlipayConfig {
	
//↓↓↓↓↓↓↓↓↓↓请在这里配置您的基本信息↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓

	// 应用ID,您的APPID，收款账号既是您的APPID对应支付宝账号
	public static String app_id = "2016101100660362";
	
	// 商户私钥，您的PKCS8格式RSA2私钥
    public static String merchant_private_key = "MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQCIBSrFQiBqShKh3PFGQ4w9OaqSD41Xe6woi+yRRgqotsOVOIHT+O/+uXNidY0Nif4yOniKCQje53FCUaKNIRZ/VK4an3l+j5at/PD0+VGSe3L6CCxVdPUwc999o7uIVp1VBtgwQuGJfmi/LZ3xu6RBcU2OL9l3cI/7YArLkra90PEfqvG2cp4IBXjnygEENkgzyfREs+lFHZtngbn70PIgjh6YMlP1iSoDNTPAJzjp35Lu2r80mPwI9l85wdiDkOpEv2FIPXDL9IE3pVx8r28qx2qaarR8V7fb963O5darS5w4lo6Y9SFN//Xd2Zj+wvnRZ81F2C1G0bcUoQnarPUtAgMBAAECggEARzN9OhjtYvY3XqeLXR6K0JnZIfAmKr9AVVE5mqoxdjOFmh0kSNOsvYhSUB38ojOz7pMQ+iDUlepNLUwSbRH+9tRa9vC35no/hAA+Gd5Qxv78JsoUev9oQd7GBLyqtCmy3glhLZI1AYY8SqcUYK+6wc8Pq/h8O7uegxW5UOsR4bY0ZRRQ/AcyyaJ3QPiNHpunth7V7t6QjIYzd+DUWc+85HDdRCzvyz3mOTu3AwXUlHANzbFqxKeGsBjFCrZgAqdB0t6rQm5WRjdy0jC3sBYqsQm70PDzc6/x1bIRFKrE8V7ZdfSTPE82cGG+Pk/KkZYkY7wCTm3Z3crSD4wA2ZeHgQKBgQDGjLGsE0z50Z4nKjPqhYDGrDbzvXySLnwFck37vAQzl6LU5+tK7baRlctOrd5+oU3WMMhc4TI5M7owuk4l5Io0YcYyG6CIEHAznVZhl4pNmeeGq2/4/UB9O7qNbsuwFMy99AODteSMCqV4j3y3edx/1E03IVFFXzcSFYgNUFtWkQKBgQCvYLARHYqhJZMGyz5gOnBE0YGR4U/KdiwZotiztS4qislWN6f4W8pJVYFLawx6/JV7RUOG6431LRWyoNt6MusoA2piuu+djbsCNPWsONe95B7Kb/spi4MudxPmMbfJR2Hg7u/0HtlXhgFEIUK91txA35//DwUEBm7XmkwKTcCa3QKBgQC+gMYEpawo0pBdYafYcGnDtf8v1HKOy90hWLAsRhT975NDlpZzGSwf+crNXhPqChjl136XZ1dJ/TC7ijZrMyHL6rhA4bMgei09yMvV7ZG8rVuxIhLYox1aS5HOHC2BcCOWamdo24BDQf/Mclgmrtz7JZdEu0oANsBfMJuOsrhAkQKBgB17+d3Gw6m38XHw9XmkGX/YYRovcQSuvVdKA3ii+zH3x0WRcdHVTLrrfyM4yg5bLJ5e1K14KJORktZHKN7wdIxzlo0mtGYej9QdJzhfDhZEpdCO5wDjDZjgOB45OZbDQ3dXdEvsa8nFI61akifsWXcmoXV2BvfYRQZGUIZi8ACZAoGAAd9IizVDzQbySlfgiNd4av7ytl4bhcXmqMcULqJgEAzA+crs35n41XWKheAACyqZtdLYRRU8BjZXYpXJ9KBBOVEPNiGqJlsUXtA8zAo+Re7692w2yyB7KjLgrG4ycIpoY0R6o6VjeojIfHpVvPo6J4II1QMt70w1EAsdZxrNYeE=";
	
	// 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm 对应APPID下的支付宝公钥。
    public static String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAiAUqxUIgakoSodzxRkOMPTmqkg+NV3usKIvskUYKqLbDlTiB0/jv/rlzYnWNDYn+Mjp4igkI3udxQlGijSEWf1SuGp95fo+Wrfzw9PlRknty+ggsVXT1MHPffaO7iFadVQbYMELhiX5ovy2d8bukQXFNji/Zd3CP+2AKy5K2vdDxH6rxtnKeCAV458oBBDZIM8n0RLPpRR2bZ4G5+9DyII4emDJT9YkqAzUzwCc46d+S7tq/NJj8CPZfOcHYg5DqRL9hSD1wy/SBN6VcfK9vKsdqmmq0fFe32/etzuXWq0ucOJaOmPUhTf/13dmY/sL50WfNRdgtRtG3FKEJ2qz1LQIDAQAB";

	// 服务器异步通知页面路径  需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
	public static String notify_url = "http://localhost/alipay/notify_url.jsp";

	// 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
	public static String return_url = "http://localhost/alipay/return_url.jsp";

	// 签名方式
	public static String sign_type = "RSA2";
	
	// 字符编码格式
	public static String charset = "utf-8";
	
	// 支付宝网关
	public static String gatewayUrl = "https://openapi.alipaydev.com/gateway.do";
	
	// 支付宝网关
	public static String log_path = "C:\\";


//↑↑↑↑↑↑↑↑↑↑请在这里配置您的基本信息↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑

    /** 
     * 写日志，方便测试（看网站需求，也可以改成把记录存入数据库）
     * @param sWord 要写入日志里的文本内容
     */
    public static void logResult(String sWord) {
        FileWriter writer = null;
        try {
            writer = new FileWriter(log_path + "alipay_log_" + System.currentTimeMillis()+".txt");
            writer.write(sWord);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

