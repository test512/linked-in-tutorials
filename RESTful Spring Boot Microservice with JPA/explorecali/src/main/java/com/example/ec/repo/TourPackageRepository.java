package com.example.ec.repo;

import com.example.ec.domain.TourPackage;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;


@RepositoryRestResource(collectionResourceRel = "packages", path = "packages")
public interface TourPackageRepository extends CrudRepository<TourPackage, String> {

    TourPackage findByName(@Param("name") String name);

    //Not exposed by Spring Data REST
    @Override
    @RestResource(exported = false)
    <S extends TourPackage> S save(S s);

    //Not exposed by Spring Data REST
    @Override
    @RestResource(exported = false)
    <S extends TourPackage> Iterable<S> save(Iterable<S> iterable);

    //Not exposed by Spring Data REST
    @Override
    @RestResource(exported = false)
    void delete(String s);

    //Not exposed by Spring Data REST
    @Override
    @RestResource(exported = false)
    void delete(TourPackage tourPackage);

    //Not exposed by Spring Data REST
    @Override
    @RestResource(exported = false)
    void delete(Iterable<? extends TourPackage> iterable);

    //Not exposed by Spring Data REST
    @Override
    @RestResource(exported = false)
    void deleteAll();
}

