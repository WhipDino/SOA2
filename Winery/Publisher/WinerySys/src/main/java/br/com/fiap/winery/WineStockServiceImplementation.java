package br.com.fiap.winery;

import jakarta.jws.WebService;

@WebService(endpointInterface = "br.com.fiap.winery.WineStockService")
public class WineStockServiceImplementation implements WineStockService {
    
    @Override
    public String getMenu() {
        return "Menu de Vinhos:\n" +
               "1. Cabernet Sauvignon - Uva tinta com sabor encorpado e taninos firmes\n" +
               "2. Merlot - Uva tinta com sabor suave e frutado\n" +
               "3. Chardonnay - Uva branca com notas de frutas tropicais\n" +
               "4. Sauvignon Blanc - Uva branca com sabor cítrico e refrescante\n" +
               "5. Malbec - Uva tinta com sabor intenso e notas de frutas escuras\n" +
               "6. Pinot Noir - Uva tinta com sabor delicado e elegante\n" +
               "7. Riesling - Uva branca com sabor frutado e boa acidez";
    }
    
    @Override
    public String placeOrder(String name, int quantity) {
        return "Pedido confirmado!";
    }
}
