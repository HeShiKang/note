 * 本版本出错想回到某个版本
    > git reset --hard +版本号
* 查看历史  
    >git log/refolg
* 强置push（记一次操作）   
    >A 版本是昨晚的版本为正确代码，F版本为当前版本，中间还有B，C，D版本因某些不记得的操作而导致昨天晚上提交的代码全部失踪了，于是
    使用**git reset**回退到A版本  但是**git push**之前必须要**git pull** ，git pull会将当前版本合并，因此A版本修改的内容又会消失，
    解决办法便是使用
    **git push -f -u origin master**
    强制性push，因为B版本为无效内容
## 问题：在公司clone 项目时老是切换分支分支后看不到代码。
  >git clone  克隆下来后看到的是master 分支,但是看不到dev分支代码
* 使用  git checkout -b dev origin/dev   新建一个分支并将连远程分支 这样就能看见分支代码了。
git branch -va   此命令可以查看本地+远程分支列表
## 问题：先创建本地仓库后建立远程仓库的情况下，建立连接git pull 时 报 refusing to merge unrelated histories
* 原因是因为 本地仓库和远程仓库是完全不通的项目。可以使用命令 git pull --allow-unrelated-histories

$ git push origin

上面命令表示，将当前分支推送到origin主机的对应分支。 

如果当前分支只有一个追踪分支，那么主机名都可以省略。 

$ git push 如果当前分支与多个主机存在追踪关系，那么这个时候-u选项会指定一个默认主机，这样后面就可以不加任何参数使用git push。

$ git push -u origin master 上面命令将本地的master分支推送到origin主机，同时指定origin为默认主机，后面就可以不加任何参数使用git push了。