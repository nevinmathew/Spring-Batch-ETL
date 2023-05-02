package com.etl.batch.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.etl.batch.domain.Profile;

@Repository
public interface ProfileRepository extends JpaRepository<Profile, Integer> {

}
