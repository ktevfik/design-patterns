package structural.adapter;

/**
 * @author Tevfik Kadan
 * @created 18/11/2022 - 03:11
 */
// Sistem en başta bu arayüzü uygulayarak çalışmaktadır.
public interface IXmlSerializer {
    String serializeObject(Object obj);
}
