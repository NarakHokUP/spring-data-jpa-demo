package com.example.demo;

import com.example.demo.entity.*;
import com.example.demo.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.Date;
import java.util.List;

@EnableSwagger2
@Import({springfox.documentation.spring.data.rest.configuration.SpringDataRestConfiguration.class})
@SpringBootApplication
@EnableJpaRepositories("com.example.demo.repository")
public class DemoApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}


	@PersistenceContext
	private EntityManager em;

	@Autowired
	private UserRepository userRepository;

	@Autowired
	AccountRepository accountRepository;

	@Autowired
	TransactionRepository transactionRepository;

	@Autowired
	ArticleRepository articleRepository;

	@Transactional
	@Override
	public void run(String... strings) throws Exception {

		Account account = new Account();
		account.setName("Saving Account");

		Transaction transaction1 = new Transaction();
		transaction1.setType("Buy Coffee");
		transaction1.setAccount(account);

		Transaction transaction2 = new Transaction();
		transaction2.setType("Buy Fruit");
		transaction2.setAccount(account);

		account.getTransactions().add(transaction1);
		account.getTransactions().add(transaction2);

		accountRepository.save(account);
		System.out.println(account.getTransactions().get(0));
		System.out.println(account.getTransactions().get(1));

		//Transaction t1 = transactionRepository.findOne(account.getTransactions().get(0).getId());

		//System.out.println(t1.getAccount());

/*		Address address = new Address();
		address.setCode("504");
		address.setStreet("Monivong Blvd.");

		//addressRepository.save(address);

		Address address1 = new Address();
		address1.setCode("505");
		address1.setStreet("Preas Sihanuk Blvd.");
		//addressRepository.save(address1);


		User user = new User();
		user.setPassword("123");
		user.setUsername("Phearun");
		user.setRegisterDate(new Date());
		user.getAddress().add(address);
		user.getAddress().add(address1);

		userRepository.save(user);*/

		Author author = new Author();
		author.setName("Phearun");
		author.setDateOfBirth(new Date());

		Author author1 = new Author();
		author1.setName("Dara");
		author1.setDateOfBirth(new Date());

		Category category = new Category();
		category.setName("Technology");
		Category category1 = new Category();
		category1.setName("Fashion");

		Article article = new Article();
		article.setTitle("Testing");
		article.setCategory(category);
		article.setAuthor(author);

		Article article1 = new Article();
		article1.setTitle("Testing1");
		article1.setCategory(category1);
		article1.setAuthor(author1);

		Article article2 = new Article();
		article2.setTitle("Testing2");
		article2.setCategory(category);
		article2.setAuthor(author);

		//author.getArticles().add(article);
		//author.getArticles().add(article2);
		//author1.getArticles().add(article1);

		articleRepository.save(article);
		articleRepository.save(article1);
		articleRepository.save(article2);
	}
}
