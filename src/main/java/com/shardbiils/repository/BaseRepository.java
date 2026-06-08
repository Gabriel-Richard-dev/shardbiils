package com.shardbiils.repository;

import com.shardbiils.model.BaseEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BaseRepository<E extends BaseEntity, T extends Number> extends JpaRepository<E, T> {

}
