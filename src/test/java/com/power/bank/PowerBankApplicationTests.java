package com.power.bank;

import com.power.bank.dao.TProductMapper;
import com.power.bank.entity.TPowerProduct;
import com.power.bank.entity.TProduct;
import com.power.bank.service.ProductService;
import com.power.bank.utils.ToolsUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PowerBankApplicationTests {

	@Autowired
	TProductMapper tProductMapper;

	@Autowired
	ProductService productService;

	@Test
	public void contextLoads() {
		for(int i = 1; i<=6;i++){
			TPowerProduct tPowerProduct = new TPowerProduct();
			tPowerProduct.setType(i+"");
			tPowerProduct.setName("powerBank"+i);
			productService.addPowerProduct(tPowerProduct);
		}
	}

}
