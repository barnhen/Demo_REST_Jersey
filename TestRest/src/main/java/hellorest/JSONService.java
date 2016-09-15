package hellorest;


import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.core.Response;

import model.Product;

public class JSONService implements IJSONService {

    @Override
    public List<Product> getProductInJSON() {
        // TODO Auto-generated method stub
        List<Product> produtcs = new ArrayList<Product>();
        Product product = new Product();
        product.setName("iPad 3");
        product.setQty(999);
        produtcs.add(product);
        product = new Product();
        product.setName("iPhone 6");
        product.setQty(888);
        produtcs.add(product);

        return produtcs;
    }

    @Override
    public Response createProductInJSON(Product product) {
        // TODO Auto-generated method stub
        String result = "Product created : " + product;
        return Response.status(201).entity(result).build();
    }
}
