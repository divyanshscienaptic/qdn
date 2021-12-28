package com.hp.QppColumbia.services.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.hp.QppColumbia.services.dao.AccountSummaryDetailsDao;
import com.hp.QppColumbia.services.entity.AccountSummaryDetails;

public interface AccountSummaryRepo extends JpaRepository<AccountSummaryDetailsDao, Integer> {
	@Query(value = "Select * from account_summary", nativeQuery = true)
	List<AccountSummaryDetailsDao> findAllRecords(); // where requesternm = ?1
	// and razonSocial=?2 and taxId=?3 and locationId = ?4 and suppliesStatus= ?5

	@Query(value = "Select * from account_summary where homologatedName = ?1", nativeQuery = true)
    AccountSummaryDetailsDao findRecordDetails(String homologatedName);

	@Query(value = "Select * from account_summary where homologatedName = ?1", nativeQuery = true)
    Optional <AccountSummaryDetailsDao> findRecordDetailsNew(String homologatedName);

	@Query(value = "Select * from account_summary where homologatedName =?1", nativeQuery = true)
	List<AccountSummaryDetailsDao> findAllRecordsByHN(String HN); // where requesternm =

	@Query(value = "Select * from account_summary where homologatedName COLLATE UTF8_GENERAL_CI LIKE %?1%", nativeQuery = true)
	List<AccountSummaryDetailsDao> findAllRecordsLikeHN(String HN);

	@Query(value = "Select * from account_summary where razonSocial =?1", nativeQuery = true)
	List<AccountSummaryDetailsDao> findAllRecordsByRazonSocial(String razonSocial);

	@Query(value = "Select * from account_summary where razonSocial COLLATE UTF8_GENERAL_CI LIKE %?1%", nativeQuery = true)
	List<AccountSummaryDetailsDao> findAllRecordsLikeRazonSocial(String razonSocial);

	@Query(value = "Select * from account_summary where taxId =?1", nativeQuery = true)
	List<AccountSummaryDetailsDao> findAllRecordsByTaxId(String taxId);

	@Query(value = "Select * from account_summary where taxId COLLATE UTF8_GENERAL_CI LIKE %?1%", nativeQuery = true)
	List<AccountSummaryDetailsDao> findAllRecordsLikeTaxId(String taxId);

	@Query(value = "Select * from account_summary where locationId =?1", nativeQuery = true)
	List<AccountSummaryDetailsDao> findAllRecordsByLocationId(String locationId);

	@Query(value = "Select * from account_summary where locationId COLLATE UTF8_GENERAL_CI LIKE %?1%", nativeQuery = true)
	List<AccountSummaryDetailsDao> findAllRecordsLikeLocationId(String locationId);

	@Query(value = "Select * from account_summary where bpsStatus =?1", nativeQuery = true)
	List<AccountSummaryDetailsDao> findAllRecordsByBpsStatus(String bps);

	@Query(value = "Select * from account_summary where hpsHardwareStatus =?1", nativeQuery = true)
	List<AccountSummaryDetailsDao> findAllRecordsByHpsStatus(String hps);

	@Query(value = "Select * from account_summary where opsHardwareStatus =?1", nativeQuery = true)
	List<AccountSummaryDetailsDao> findAllRecordsByOpsStatus(String ops);

	@Query(value = "Select * from account_summary where mpa =?1", nativeQuery = true)
	List<AccountSummaryDetailsDao> findAllRecordsByMPA(String ops);

	@Query(value = "Select * from account_summary where largeFormatStatus =?1", nativeQuery = true)
	List<AccountSummaryDetailsDao> findAllRecordsByLargeFormatStatus(String lfs);

	@Query(value = "Select * from account_summary where suppliesStatus =?1", nativeQuery = true)
	List<AccountSummaryDetailsDao> findAllRecordsBySuppliesStatus(
			String suppliesStatus); // where requesternm = ?1

	@Query(value = "Select DISTINCT(homologatedName) from account_summary", nativeQuery = true)
	List<String> findallHM();

	@Query(value = "Select DISTINCT(razonSocial) from account_summary", nativeQuery = true)
	List<String> findallRS();

	@Query(value = "Select DISTINCT(taxId) from account_summary", nativeQuery = true)
	List<String> findallTI();

	@Query(value = "Select DISTINCT(locationId) from account_summary", nativeQuery = true)
	List<String> findallLocationId();

	@Query(value = "Select DISTINCT(suppliesStatus) from account_summary", nativeQuery = true)
	List<String> findallSuppliesStatus();

	@Query(value = "Select DISTINCT(mpa) from account_summary", nativeQuery = true)
	List<String> findAllMPA();

	@Query(value = "Select DISTINCT(largeFormatStatus) from account_summary", nativeQuery = true)
	List<String> findAllLargeFormatStatus();

	@Query(value = "Select DISTINCT(hpsHardwareStatus) from account_summary", nativeQuery = true)
	List<String> findAllHpsHardwareStatus();

	@Query(value = "Select DISTINCT(opsHardwareStatus) from account_summary", nativeQuery = true)
	List<String> findAllOpsHardwareStatus();

	@Query(value = "Select DISTINCT(bpsStatus) from account_summary", nativeQuery = true)
	List<String> findAllBpsStatus();
}