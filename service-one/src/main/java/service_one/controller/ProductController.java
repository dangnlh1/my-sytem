package service_one.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import service_one.entity.Product;
import service_one.service.ProductService;

import java.util.List;

@Controller
public class ProductController {


    private final ProductService service;

    public ProductController(ProductService service) {
        this.service = service;
    }

//    public ProductController(ProductService service) {
//        this.service = service;
//    }


    @GetMapping({"/product"})
    public String viewHomePage(Model model) {
        List<Product> listProducts = service.listAll();
        model.addAttribute("listProducts", listProducts);
        return "index";
    }

    @GetMapping("/new")
    public String showNewProductPage(Model model) {
        Product product = new Product();
        model.addAttribute("product", product);
        return "new_product";
    }

//    @PostMapping(value = "/save")
//    public String saveProduct(@ModelAttribute("product") Product product) {
//        service.save(product);
//        return "redirect:/product";
//    }

    @PostMapping(value = "/save")
    public String saveProduct(@ModelAttribute("product") Product product, RedirectAttributes redirectAttributes) {
        service.save(product);
        redirectAttributes.addFlashAttribute("message", "Đã thêm thành công");
        return "redirect:/product";
    }

    @GetMapping("/edit/{test}/{testName}")
    public ModelAndView showEditProductPage(@PathVariable(name = "test") int id,
                                            @PathVariable(name = "testName") String testName) {
        ModelAndView mav = new ModelAndView("edit_product");
        Product product = service.get(id);
        System.out.printf(testName);
        mav.addObject("product", product);
        return mav;
    }

    @GetMapping("/delete/{id}")
    public String deleteProduct(@PathVariable(name = "id") int id) {
        service.delete(id);
        return "redirect:/"; //  redirect to root URL
    }

}


