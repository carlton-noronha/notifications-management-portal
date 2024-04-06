package com.byethost12.carltonnoronha.webapp.configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.thymeleaf.spring6.SpringTemplateEngine;
import org.thymeleaf.spring6.templateresolver.SpringResourceTemplateResolver;
import org.thymeleaf.spring6.view.ThymeleafViewResolver;

@Configuration
public class ViewResolverConfig {

	/*
	 * Configuring Thymeleaf. Once project is build by Maven resources in
	 * src/main/resources will end up in target/classes and in WEB-INF/classes in
	 * the WAR. Read more:
	 * https://maven.apache.org/plugins/maven-war-plugin/examples/adding-filtering-
	 * webresources.html
	 */

	@Bean
	public SpringResourceTemplateResolver templateResolver() {
		SpringResourceTemplateResolver templateResolver = new SpringResourceTemplateResolver();
		templateResolver.setPrefix("/WEB-INF/classes/templates/");
		templateResolver.setSuffix(".html");
		return templateResolver;
	}

	@Bean
	public SpringTemplateEngine templateEngine() {
		SpringTemplateEngine templateEngine = new SpringTemplateEngine();
		templateEngine.setTemplateResolver(templateResolver());
		return templateEngine;
	}

	@Bean
	public ThymeleafViewResolver viewResolver() {
		ThymeleafViewResolver viewResolver = new ThymeleafViewResolver();
		viewResolver.setTemplateEngine(templateEngine());
		return viewResolver;
	}

}
