package ibf2022.paf.day30.service;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
// import org.springframework.transaction.annotation.Transactional; //(wrkshp24)
import org.springframework.transaction.annotation.Transactional;

import ibf2022.paf.day30.exception.OrderException;
import ibf2022.paf.day30.model.SuccessTransfer;
import ibf2022.paf.day30.model.Transfer;
import ibf2022.paf.day30.repository.AccountsRepository;

// import ibf2022.paf.day30.repository.AccountsRepository;

//@Service
public class FundsTransferService {
    @Autowired
    private AccountsRepository acctRepo;
    
//     @Transactional(rollbackFor= OrderException.class)
    
//     public SuccessTransfer generateTransactionId (Transfer trns) throws OrderException {
//         String transferId = UUID.randomUUID().toString().substring(0,8);
//    trns.setTransferId(transferId);
   
        // workshop24
//    transferRepo.insertPO(trns);
//    // check order > 5 throw exception
//    if(trns.getLineItems().size() > 3) {
//     throw new OrderException();
//    }
   
   
//    lineRepo.addLineItems(ord.getLineItems(), orderId);
//    OrderResult r = new OrderResult();
//    return r;
//    }
}
