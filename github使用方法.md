## github使用方法

1. 下载别人的GitHub仓库

   - ```
     git clone https://github.com/CSwuyp/socket.git//后面这个是你的GitHub上profile的地址
     ```

2. 更新自己GitHub的仓库的内容（这个方法是直接再master上进行操作的）

   1）新建文件夹

   2）下载仓库内容

   ```
   git clone https://github.com/CSwuyp/socket.git//后面这个是你的GitHub上profile的地址
   ```

   - git clone 时出错

     ```
     OpenSSL SSL_read: Connection was reset, errno 10054
     ```

     - 解决

       这是服务器的SSL证书没有经过第三方机构的签署，所以报错。

       解决办法：

       ```
       git config --global http.sslVerify "false"
       ```

   3）进入到socket（这里是下载仓库的名称） cd socket目录后，查看仓库状态

   ```
   git status
   ```

   - 可以看到On branch master,这个说明已经在master分支上了

   4）直接替换代码

   5）使用更新全部代码

   ```
   git add *
   ```

   - 出现的warning可以不管，好像是空格还是什么格式被替换了，不影响。

   6）输入更新说明，commit只是提交到缓存区域

   ```
   git commit -m "update”
   ```

   7）真正的push到远端的仓库中，第一次上传会任务中断，然后让你先输入要上传的帐号之后才能继续上传，main指的是分支。

   ```
   git push origin main
   ```

3. 如何新建分支

   [GitHub如何新建分支方法](https://jingyan.baidu.com/article/a501d80cc92cf1ad630f5efe.html)

   



