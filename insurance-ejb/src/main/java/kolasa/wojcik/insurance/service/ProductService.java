package kolasa.wojcik.insurance.service;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import kolasa.wojcik.insurance.model.ClientInformationDTO;
import kolasa.wojcik.insurance.model.Product;

@Stateless
public class ProductService {

	@Inject
	private EntityManager em;

	public List<Product> findAvailibleProducts(
			ClientInformationDTO clientInformation) {
		
		TypedQuery<Product> productQuery = em.createQuery(
				"select p from Product p", Product.class);
		
		return productQuery.getResultList();
	}

}
