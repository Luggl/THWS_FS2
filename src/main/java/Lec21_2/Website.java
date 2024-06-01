package Lec21_2;


import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

public class Website {
    public static void main(String[] args) {
//        Response response = ClientBuilder.newClient()
//                .target("https://en.wikipedia.org/")
//                .path("wiki/Fluent_interface")
//                .request(MediaType.TEXT_HTML)
//                .get();
//        String out = response.readEntity(String.class);
//        System.out.println(out);


        Response response2 = ClientBuilder.newClient()
                .target("https://jsonplaceholder.typicode.com/")
                .path("posts/1")
                .request(MediaType.APPLICATION_JSON_TYPE)
                .get();
        String getJSON = response2.readEntity(String.class);
        System.out.println(getJSON);


    }
}
