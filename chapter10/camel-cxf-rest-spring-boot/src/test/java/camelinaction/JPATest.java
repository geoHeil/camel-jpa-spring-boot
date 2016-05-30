//package camelinaction;
//
///**
// * based on https://github.com/camelinaction/camelinaction2/blob/master/chapter6/jpa/src/test/java/camelinaction/JpaTest.java
// * and
// * https://github.com/camelinaction/camelinaction2/blob/master/chapter10/camel-cxf-rest-spring-boot/src/test/java/camelinaction/RestOrderServiceTest.java
// */
//
//import org.apache.camel.CamelContext;
//import org.apache.camel.builder.RouteBuilder;
//import org.apache.camel.component.jpa.JpaEndpoint;
//import org.apache.camel.component.mock.MockEndpoint;
//import org.junit.Assert;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.SpringApplicationConfiguration;
//import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//
//import javax.persistence.EntityManager;
//import java.util.List;
//
//import static org.apache.camel.test.junit4.TestSupport.assertIsInstanceOf;
//
//@RunWith(SpringJUnit4ClassRunner.class)
//@SpringApplicationConfiguration(classes = OrderRoute.class)
//public class JpaTest extends Assert {
//
//    private static final Logger LOG = LoggerFactory.getLogger(JpaTest.class);
//TODO properly get the testcase to work with jpa
//    @Autowired
//    private CamelContext camelContext;
//
//    @Test
//    public void testRouteJpa() throws Exception {
//        MockEndpoint mock = getMockEndpoint("mock:result");
//        mock.expectedMessageCount(1);
//
//        Order order = new Order();
//        order.setAmount(33);
//        order.setCustomerName("foo bar");
//        order.setPartName("something");
//
//        template.sendBody("seda:accounting", purchaseOrder);
//
//        assertMockEndpointsSatisfied();
//        assertEntityInDB();
//    }
//
//    @Override
//    protected RouteBuilder createRouteBuilder() {
//        return new RouteBuilder() {
//            public void configure() {
//                // use seda instead of JMS for testing
//                from("seda:accounting")
//                        .to("jpa:camelinaction.Order")
//                        .to("mock:result");
//            }
//        };
//    }
//
//    private void assertEntityInDB() throws Exception {
//        JpaEndpoint endpoint = camelContext.getEndpoint("jpa:camelinaction.Order", JpaEndpoint.class);
//        EntityManager em = endpoint.getEntityManagerFactory().createEntityManager();
//
//        List list = em.createQuery("select x from camelinaction.Order x").getResultList();
//        assertEquals(1, list.size());
//
//        assertIsInstanceOf(Order.class, list.get(0));
//
//        em.close();
//    }
//}