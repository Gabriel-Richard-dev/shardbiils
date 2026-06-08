package com.shardbiils.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name= "users")
public class User extends BaseEntity<Long> {

}
