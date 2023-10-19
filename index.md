# Part 1
![Image](@D9PNSPN0BWXLV0V[R6D6SR.png)<br>
 __I get this by changing some code from NumberServer, so the framework is almost the same.__

![Image](2.11.png) <br>
__1. The first test, 'hello' calls the StringHandler method.__ <br>
__2. The relevant argument of Handler is HttpExchange, and then the request URL will grab the string in the query after the path and store it in newMessage.__ <br>
__3. Increase the corresponding Messagenumber. The message field now has ‘1. Hello \n’.__ <br>

![Image](2.12.png) <br>
__1. The Second test, '123' also calls the StringHandler Method.__ <br>
__2. It is also the same as above because the code reads these numbers as strings, not integers. So the code will also check for the change in the URL as an argument, read the path and query, and store it in newMessage.__ <br>
__3. It also changes the Messagenumber increase one. Note I tried on my own but didn't screenshot it once; that makes this time the third time, so Messagenumber is now 3, and the message field now has'1. Hello \n 2. number \n 3. 123\n'__ <br>
# Part 2
__1.__
![Image](2.24.png) <br>
![Image](2.25.png) <br>
__2.__
![Image](2.22.png) <br>
__I note that the remote computer from ieng6 seems to have hidden my .ssh folder. I can't use ls in the main folder to see it, but I can use ls or cd .ssh path to call it out.__ <br>
![Image](2.23.png) <br>
![Image](2.21.png) <br>

__3.__
![Image](2.26.png) <br>

# Part 3 <br>

__I have learned Java and its related code programming elsewhere before. However, I have never used terminal and remote computer access, so I think I have learned some relevant commands in the current course on using these helpful tools to create a Web Server.__

