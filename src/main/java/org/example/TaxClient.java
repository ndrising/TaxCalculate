package org.example;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.URL;
import java.util.Scanner;

public class TaxClient {
    public static void main(String[] args) {
        try {
            // WSDL 文件的 URL
            URL url = new URL("http://localhost:8080/taxcalculator?wsdl");

            // 使用 WSDL 中的命名空间和服务名称
            QName qname = new QName("http://example.org/", "TaxCalculatorImplService");

            // 创建服务对象
            Service service = Service.create(url, qname);

            // 使用 TaxCalculator 接口获取端口
            TaxCalculator calculator = service.getPort(TaxCalculator.class);

            // 调用服务并输出结果
            System.out.println("请输入您的收入");
            Scanner scanner=new Scanner(System.in);
            double input =scanner.nextInt();
            double result = calculator.calculateTax(input);
            System.out.println("收入 "+input+" 的税是: " + result);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
