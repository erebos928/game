package sport.football.game;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.sql.DataSource;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@ComponentScan
@EnableTransactionManagement
class ApplicationConfig {
	
	@Bean
	public LocalContainerEntityManagerFactoryBean entityManagerFactory() {
		 HibernateJpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
		    //vendorAdapter.setGenerateDdl(true);

		    LocalContainerEntityManagerFactoryBean factory = new LocalContainerEntityManagerFactoryBean();
		    factory.setEntityManagerFactoryInterface(EntityManagerFactory.class);
		    factory.setPersistenceUnitName("liga");
		    factory.setJpaVendorAdapter(vendorAdapter);
		    //factory.setPackagesToScan("com.acme.domain");
		   // factory.setDataSource(dataSource());
		    return factory;
	}

	public DataSource dataSource() {
		DataSourceBuilder dataSourceBuilder = DataSourceBuilder.create();
        dataSourceBuilder.driverClassName("org.h2.Driver");
        dataSourceBuilder.url("jdbc:h2:tcp://localhost/~/football");
        dataSourceBuilder.username("sa");
        dataSourceBuilder.password("");
        return dataSourceBuilder.build();
	  }
	
}
