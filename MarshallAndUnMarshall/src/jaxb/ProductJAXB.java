package jaxb;

import java.io.File;
import java.util.*;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;




public class ProductJAXB {

	
	public void marshall (){
		
		try {
			Product product = new Product("1", "Jose Medina", 100.00, 2, new Date());
			JAXBContext jc = JAXBContext.newInstance(Product.class);
			Marshaller ms = jc.createMarshaller();
			ms.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			ms.marshal(product, new File("C:/Documentos Jose Medina/trabajo chile/JAXBLectura-master/JAXBLectura-master/product.xml"));
			ms.marshal(product, System.out);
				
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}
}
