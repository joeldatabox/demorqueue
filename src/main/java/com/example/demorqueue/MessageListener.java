package com.example.demorqueue;

import com.github.sonus21.rqueue.annotation.RqueueListener;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
public class MessageListener {

  @RqueueListener(value = "${email.queue.name}")
  public void sendEmail(Email email) {
    System.out.println("Email " + email.toString() );
  }

  @RqueueListener(delayedQueue = "true", value = "${invoice.queue.name}")
  public void generateInvoice(Invoice invoice) {
    System.out.println("Invoice " + invoice.toString());
  }
}
