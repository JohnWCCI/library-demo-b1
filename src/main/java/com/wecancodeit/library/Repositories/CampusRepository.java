package com.wecancodeit.library.Repositories;

import org.springframework.data.repository.CrudRepository;

import com.wecancodeit.library.Models.Campus;

public interface CampusRepository extends CrudRepository<Campus, Long> {
    Campus findCampusByLocation(String location);
}