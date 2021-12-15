package com.nidhallourimi.springbootlibrarystore.repository;

import com.nidhallourimi.springbootlibrarystore.model.PurchaseHistory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PurchaseHistoryRepository extends JpaRepository<PurchaseHistory,Long> {
        //test inner join later
    @Query("select  " +
            "b.title as title ,p.price as price ,p.purchaseTime as purchaseTime" +
            " from PurchaseHistory p  left join Book b on p.bookId=b.id " +
            "where p.userId=: userId")
    List<PurchaseHistory> finAllPurchasesOfUser(@Param("userIde") Long userId);
}
