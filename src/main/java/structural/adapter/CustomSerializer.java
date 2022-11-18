package structural.adapter;

/**
 * @author Tevfik Kadan
 * @created 18/11/2022 - 03:14
 */
// Sisteme daha sonradan dahil olan yapı.
// Sistemin kullandığı arayüzü uygulamamaktadır.
public class CustomSerializer implements IXmlSerializer {

    @Override
    public String serializeObject(Object obj) {
        return "CustomSerializer.serializeObject";
    }

}
