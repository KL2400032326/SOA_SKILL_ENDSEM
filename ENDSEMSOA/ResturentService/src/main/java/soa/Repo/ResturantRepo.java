package soa.Repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import soa.model.Resturant;
@Repository
public  interface ResturantRepo extends JpaRepository<Resturant , Long> {

	List<Resturant> findAll();

}
