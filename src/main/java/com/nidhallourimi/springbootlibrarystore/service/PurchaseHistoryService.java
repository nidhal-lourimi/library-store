package com.nidhallourimi.springbootlibrarystore.service;

import com.nidhallourimi.springbootlibrarystore.model.PurchaseHistory;
import com.nidhallourimi.springbootlibrarystore.repository.PurchaseHistoryRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public record PurchaseHistoryService(PurchaseHistoryRepository purchaseHistoryRepository)
{


    public PurchaseHistory  savePurchaseHistory(PurchaseHistory purchaseHistory){
        purchaseHistory.setPurchaseTime(LocalDateTime.now());
        return purchaseHistoryRepository.save(purchaseHistory);
    }

    public List<PurchaseHistory> findPurchasedItemUser(Long userId){
        return purchaseHistoryRepository.finAllPurchasesOfUser(userId);
    }
}
