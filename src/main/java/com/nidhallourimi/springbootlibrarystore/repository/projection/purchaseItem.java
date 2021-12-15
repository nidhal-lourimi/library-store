package com.nidhallourimi.springbootlibrarystore.repository.projection;

import java.time.LocalDateTime;

public interface purchaseItem {
    String getTitle();
    Double getPriced();
    LocalDateTime getLocalDateTime() ;
}
