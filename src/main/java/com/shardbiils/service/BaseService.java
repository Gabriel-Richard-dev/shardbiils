package com.shardbiils.service;

import com.shardbiils.model.BaseEntity;
import com.shardbiils.repository.BaseRepository;
import jakarta.transaction.Transactional;

public class BaseService<entity extends BaseEntity, T extends Number> {
    private BaseRepository<entity, T> repository;

    @Transactional
    public entity saveOrUpdate(entity e) {
        return repository.saveAndFlush(e);
    }

}
