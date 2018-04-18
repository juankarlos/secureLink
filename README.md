# secureLink Test
# @author: Juan Carlos Araya
# @email: juank.araya@gmail.com
# Code under github: https://github.com/juankarlos/secureLink
# Branches: master, production, development.


# Current bugs in development.
	1. TBD
	
# Important notes:
	1. Instructions added for windows environment, equivalent instructions works for unix environment.

#How to compile

	1. Check location of your JDK and replace with below.
	
	2. Open a command line.
	
	3. Create a tmp folder c:\temp\
	
		mkdir temp
		cd temp
			
	
	4. Get code from GIT, clone or download using:
	
		a. option 1: git clone https://github.com/juankarlos/secureLink.git
		
			cd c:\temp\securelink\
		
		b. option 2: download using: https://github.com/juankarlos/secureLink/archive/production.zip
		
			unzip into c:\temp\securelink\
					
	5. Select production branch:
	
		a. cd c:\temp\securelink\
		c. git checkout production. 
	

	2. Compile.
		"C:\Program Files\Java\jdk-10\bin\javac" -d bin/ -cp  src src/com/securelink/RuleRunner.java

	3. Run
		"C:\Program Files\Java\jdk-10\bin\java" -cp bin/ com.securelink.RuleRunner 100 50 30 50 60 20 5000
		
		
#Notes
	#Change branch for development
		git checkout development
		
	#Change branch to master, equivalent to production in some cases
		git checkout master