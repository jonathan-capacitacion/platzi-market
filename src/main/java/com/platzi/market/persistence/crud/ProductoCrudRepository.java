package com.platzi.market.persistence.crud;

import com.platzi.market.persistence.entity.Producto;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface ProductoCrudRepository extends CrudRepository<Producto, Integer> {

    // Sentencias nativas
    /*@Query(value = "SELECT * FROM productos WHERE id_categoria = ?", nativeQuery = true)
    List<Producto> getByCategoria(int idCategoria);*/

    // Qry Method - trae lista de productos de cierta categoria
    List<Producto> findByIdCategoriaOrderByNombreAsc(int idCategoria);

    // Qry method que retorna tipo optional
    Optional<List<Producto>> findByCantidadStockLessThanAndEstado(int cantidadStock, boolean estado);
}
