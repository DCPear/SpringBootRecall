package com.dcpear.repo;

import com.dcpear.domain.Staff;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StaffRepository extends JpaRepository<Staff,String> {


}
