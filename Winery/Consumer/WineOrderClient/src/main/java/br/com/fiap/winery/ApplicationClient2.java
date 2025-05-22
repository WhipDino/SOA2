package br.com.fiap.winery;

import jakarta.xml.ws.Service;
import java.net.URL;
import javax.xml.namespace.QName;

public class ApplicationClient2 {
    public static void main(String[] args) {
        try {
            // Conexão com WineStockService
            URL url = new URL("http://localhost:8085/WineStockService?wsdl");
            QName qName = new QName("http://winery.fiap.com.br/", "WineStockServiceImplementationService");
            
            Service service = Service.create(url, qName);
            WineStockService wineStockService = service.getPort(WineStockService.class);
            
            String order = wineStockService.placeOrder("Cabernet Sauvignon", 2);
            System.out.println(order);
            
            // Conexão com WineWarningService
            URL url2 = new URL("http://localhost:8086/WineWarningService?wsdl");
            QName qName2 = new QName("http://winery.fiap.com.br/", "WineWarningServiceImplementationService");
            
            Service service2 = Service.create(url2, qName2);
            WineWarningService wineWarningService = service2.getPort(WineWarningService.class);
            
            String warn = wineWarningService.sendWarn();
            System.out.println(warn);
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
