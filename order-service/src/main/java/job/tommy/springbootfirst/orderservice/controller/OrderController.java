package job.tommy.springbootfirst.orderservice.controller;

import job.tommy.springbootfirst.orderservice.dto.OrderDTO;
import job.tommy.springbootfirst.orderservice.model.Order;
import job.tommy.springbootfirst.orderservice.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orders")
@RequiredArgsConstructor
public class OrderController {

    private final OrderService orderService;

    @GetMapping
    public List<Order> all() {
        return orderService.all();
    }

    @PostMapping
    public Long create(@RequestBody OrderDTO dto) {
        var order = new Order(null,
                dto.getOrderNumber(),
                dto.getPrice(),
                dto.getQuantity());

        orderService.save(order);

        return order.getId();
    }
}
