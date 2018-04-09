$ git init
Initialized empty Git repository in C:/Users/pashtikar/config/.git/

pashtikar@USHYDPASHTIKAR1 MINGW64 ~/config (master)
$ vi roomservices.properties

pashtikar@USHYDPASHTIKAR1 MINGW64 ~/config (master)
$ cat roomservices.properties
server.port=8101

pashtikar@USHYDPASHTIKAR1 MINGW64 ~/config (master)
$ git add --all
warning: LF will be replaced by CRLF in roomservices.properties.
The file will have its original line endings in your working directory.

pashtikar@USHYDPASHTIKAR1 MINGW64 ~/config (master)
$ git commit -m "Adding initial config"
[master (root-commit) 8b657eb] Adding initial config
warning: LF will be replaced by CRLF in roomservices.properties.
The file will have its original line endings in your working directory.
 1 file changed, 1 insertion(+)
 create mode 100644 roomservices.properties
 
 
http://localhost:9000/roomservices/default
