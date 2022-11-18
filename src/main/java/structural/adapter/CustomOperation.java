package structural.adapter;

/**
 * @author Tevfik Kadan
 * @created 18/11/2022 - 03:13
 */
public class CustomOperation {
    private final IXmlSerializer xmlSerializer;

    public CustomOperation(IXmlSerializer xmlSerializer) {
        this.xmlSerializer = xmlSerializer;
    }

    public String serializeObject(Object obj) {
        return xmlSerializer.serializeObject(obj);
    }
}
