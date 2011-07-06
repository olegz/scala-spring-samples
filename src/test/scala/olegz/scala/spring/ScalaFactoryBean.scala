/*
 * Copyright 2002-2011 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package olegz.scala.spring

import org.springframework.beans.factory.FactoryBean
/**
 * @author Oleg Zhurakousky
 *
 * http://creativekarma.com/ee.php/weblog/comments/scala_function_objects_from_a_java_perspective/
 */
class ScalaFactoryBean extends FactoryBean[PrintFunction] {
  
  val myFunction = new PrintFunction()

  def getObject(): PrintFunction = { 
    
	return myFunction
  }

  def getObjectType(): Class[PrintFunction] = { 
    classOf[PrintFunction]
  }

  def isSingleton(): Boolean = { true }
}

/**
 * 
 */
class PrintFunction extends Function[String, Unit]{
   def apply(in: String) = println("From Scala function: " + in)
}

  
