package structural.adapter;

/**
 * @author Tevfik Kadan
 * @created 18/11/2022 - 03:15
 */
// Daha sonradan dahil edilen yapının sisteme adepte edilmesi işlemi.
// Sistemin kullandığı arayüzü uygular.
// Bu sayede IXmlSerializer'i uygulayan bir sınıf örneği istendiğinde
// bu sınıf örneğini vererek mevcut koda dokunmadan sistemin devam etmesi
// sağlaır.
public class CustomSerializerAdapter implements IXmlSerializer {
    @Override
    public String serializeObject(Object obj) {
        CustomSerializer customSerializer = new CustomSerializer();
        return customSerializer.serializeObject(obj);
    }
}
