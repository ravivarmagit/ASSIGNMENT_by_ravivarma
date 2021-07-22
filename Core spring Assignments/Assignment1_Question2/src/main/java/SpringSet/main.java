package SpringSet;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

        public class main {
            public static void main(String[] args) {
                ApplicationContext applicationContext = new ClassPathXmlApplicationContext("SpringSetBeans.xml");
                SpringSet.Question question = applicationContext.getBean(Question.class);
                question.print();
            }
        }
