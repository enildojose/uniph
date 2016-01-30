package br.com.sitedoph.uniph.infraestrutura.persistencia;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.Test;

public class PersistenciaTeste {

	@Test
	public void deveCriarEntityManagerFactoryEEntityManagertest() {

		EntityManager em = JPAUtil.getEntityManager();
		em.close();
	}

}
