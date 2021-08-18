package com.sbsecuritydb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.sbsecuritydb.model.Product;
import com.sbsecuritydb.service.ProductService;

@Controller
public class ProductController {

	@Autowired
	private ProductService productService;

    @GetMapping("/")
    public String viewHomePage(Model model) {
        List<Product> listProducts = productService.listAll();
        model.addAttribute("listProducts", listProducts);
       
        return "index";
    }
   
    @GetMapping("/new")
    public String showNewProductForm(Model model) {
        Product product = new Product();
        model.addAttribute("product", product);
       
        return "new_product";
    }
   
    @PostMapping(value = "/save")
    public String saveProduct(@ModelAttribute("product") Product product) {
        productService.save(product);
       
        return "redirect:/";
    }
   
    @GetMapping("/edit/{id}")
    public ModelAndView showEditProductForm(@PathVariable(name = "id") Long id) {
        ModelAndView mav = new ModelAndView("edit_product");
       
        Product product = productService.get(id);
        mav.addObject("product", product);
       
        return mav;
    }
   
    @GetMapping("/delete/{id}")
    public String deleteProduct(@PathVariable(name = "id") Long id) {
        productService.delete(id);
       
        return "redirect:/";
    }

}
