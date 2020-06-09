package br.com.servicename.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.servicename.model.Company;

public interface CompanyRepository extends JpaRepository<Company, String> {
}
