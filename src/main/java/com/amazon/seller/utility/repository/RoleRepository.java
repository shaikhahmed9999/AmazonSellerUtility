package com.amazon.seller.utility.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.amazon.seller.utility.models.ERole;
import com.amazon.seller.utility.models.Role;

public interface RoleRepository extends MongoRepository<Role, String> {
  Optional<Role> findByName(ERole name);
}
