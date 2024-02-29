package org.example.pay.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 支付交易表 前端控制器
 * </p>
 *
 * @author xxb
 * @since 2024-02-29
 */
@RestController
@RequestMapping("/tPay")
@Tag(name = "pay")
public class TPayController {

    @PostMapping("query")
    @Operation(summary = "获取支付列表")
    public String query(){
        return "132";
    }


}
