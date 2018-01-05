##1、Spring Boot简介
- Spring Boot是用来简化Spring应用初始搭建以及开发过程的全新框架，被认为是Spring MVC的“接班人”。
 - 简化配置，化繁为简。
 - 备受关注，是下一代框架。
- 微服务的入门级微框架。

![SpringBoot和SpringMVC关系](http://upload-images.jianshu.io/upload_images/325120-787a4a17bf651f6e.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/800)

![Google五年来的两个框架搜索热度对比](http://upload-images.jianshu.io/upload_images/325120-c98ef10d92f092c3.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/800)


##2、搭建开发环境
- 1:在File菜单里面选择 New > Project,然后选择Spring Initializr，接着如下图一步步操作即可。

![](http://upload-images.jianshu.io/upload_images/325120-67b9e526e91e32a1.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/800)

![](http://upload-images.jianshu.io/upload_images/325120-06cd08fd756fc28e.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/800)
 - 2:根据上面的操作并点击Next.得到初始化的一个Spring Boot的框架了，项目结构如下：
![](http://upload-images.jianshu.io/upload_images/325120-f196d52525bcd97f.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/800)

![](http://upload-images.jianshu.io/upload_images/325120-ae53dfe6b7c6c2d0.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/800)

- 3:运行程序。选择 `SpringbootApplication`右键选择 `run`即可。

![](http://upload-images.jianshu.io/upload_images/325120-0c44f58d5e9b083c.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/800)

- 4:运行结果如下

![](http://upload-images.jianshu.io/upload_images/325120-50ef08ef0c0b344a.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/800)

- 5:创建控制器Controller.

![](http://upload-images.jianshu.io/upload_images/325120-7b87284d08c5b910.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/800)

![](http://upload-images.jianshu.io/upload_images/325120-787e49ee0fadf37c.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/800)

##3、配置属性
方法一：
 1:创建application.yml文件

   ![](http://upload-images.jianshu.io/upload_images/325120-fe3f4d5b9cd0cd45.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/800)

2:在控制器中使用该属性

     ![](http://upload-images.jianshu.io/upload_images/325120-d04e76cd75458c1a.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/800)

 3: 运行结果如下：

 ![](http://upload-images.jianshu.io/upload_images/325120-2008163cb77f97c6.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/800)

方法二：只用写一次的方法，把配置分组。

![](http://upload-images.jianshu.io/upload_images/325120-41cae89f8118e602.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/800)

![](http://upload-images.jianshu.io/upload_images/325120-26d3cc789d5eb5a5.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/800)

![](http://upload-images.jianshu.io/upload_images/325120-f63a201dc21ee6ff.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/800)

- 动态设置不同环境下配置不同的问题

  创建开发环境的属性配置文件和生产环境的配置文件

   ![](http://upload-images.jianshu.io/upload_images/325120-b75414ec7e98a733.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/800)

    ![](http://upload-images.jianshu.io/upload_images/325120-277eb247460d367b.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/800)
##4、Controller控制器的使用
![](http://upload-images.jianshu.io/upload_images/325120-f031196cd50c7dd8.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/800)

  单纯使用@Controller,需要配合模版来使用

![](http://upload-images.jianshu.io/upload_images/325120-fe687d10020f990f.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/800)

  在resources包下创建模版文件

![](http://upload-images.jianshu.io/upload_images/325120-4aebd623ea457fe7.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/800)

![](http://upload-images.jianshu.io/upload_images/325120-a3d21e8bb8c0710b.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/800)

 运行结果：
![](http://upload-images.jianshu.io/upload_images/325120-992330f8711ddea3.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/800)

最后不推荐这种方式，只需要了解就可以了。现在都是前后端分离的方式。

其实RestController相当于ResponseBody和Controller的共同作用

![](http://upload-images.jianshu.io/upload_images/325120-a27448446d2925d0.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/800)

##5、 ResustMapping使用
![](http://upload-images.jianshu.io/upload_images/325120-1c394023116674a1.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/800)

![](http://upload-images.jianshu.io/upload_images/325120-8041cf35fb2f1684.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/800)

运行结果：

![](http://upload-images.jianshu.io/upload_images/325120-50deaf6334133067.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/800)

##6、获取参数和注解

![](http://upload-images.jianshu.io/upload_images/325120-2774da8ed2600849.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/800)

当请求的url含参数时   `127.0.0.1:8081/hello/say/10`

![](http://upload-images.jianshu.io/upload_images/325120-9d255220c92c2f95.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/800)

当请求的url中是 `127.0.0.1:8081/hello/say?id=100`

![](http://upload-images.jianshu.io/upload_images/325120-5d200039a6f0ef77.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/800)

在单个参数的情况下，这样写完全没问题。但是当参数比较多的时候，就需要创建对象的方式来获取参数的值了。这样做更加优雅一些

在一个查询接口中，需要的参数比较多，如果还是使用GET方式进行请求的话，那么，Controller 中的方法的参数列表将会非常多，如：
```
public List<String> getName(@RequestParam String query1,
                            @RequestParam String query2,
                            @RequestParam String query3,
                            ......) {
        return new ArrayList<>();
}
```
这种情况下最好的方式就是： `将所有参数封装成一个类，然后使用 @RequestBody注解将参数自动解析成该类的一个实例`。

##7、数据库操作

- 1:  Spring-Data-Jpa来操作MySQL数据库。
    - Jpa(Java Persistence API) 定义了一系列对象持久化的标准，目前实现这一规范的产品有Hibernate 、TopLink等。
   - Spring-Data-Jpa是对Hibernate的整合。

    - 实体映射MySQL数据库表，启动服务时包错误信息：
     `Caused by: org.hibernate.AnnotationException: No identifier specified fo xxxx`

      ![](http://upload-images.jianshu.io/upload_images/325120-a14496ac739bff0f.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/800)

- 2:RESTful API设计
  - 查询所有的投诉请求信息
    ![](http://upload-images.jianshu.io/upload_images/325120-207f48ddd0251995.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/800)

![](http://upload-images.jianshu.io/upload_images/325120-807242962e558bec.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/800)

![](http://upload-images.jianshu.io/upload_images/325120-addc08c6f7b21204.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/800)

这里的返回的结果没有按照后端的标准来，只是一个例子。包括命名规则，也没按照规范来。希望大家不要这样写。

- 插入一条投诉信息
![](http://upload-images.jianshu.io/upload_images/325120-c6716f44796cb99f.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/800)

![](http://upload-images.jianshu.io/upload_images/325120-6979f264f3191dca.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/800)

- 查询一条投诉信息

![](http://upload-images.jianshu.io/upload_images/325120-4a2a4417d5676299.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/800)

![](http://upload-images.jianshu.io/upload_images/325120-35d9d3d5aa6d17df.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/800)

- 更新投诉信息
   
![](http://upload-images.jianshu.io/upload_images/325120-4a60157d136ef38d.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/800)

![](http://upload-images.jianshu.io/upload_images/325120-e91602abe01f3946.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/800)

- 删除投诉信息

![](http://upload-images.jianshu.io/upload_images/325120-fc3114ab0d53ccb5.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/800)

![](http://upload-images.jianshu.io/upload_images/325120-562015bc152fbd5f.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/800)


- 自定义查询字段

![](http://upload-images.jianshu.io/upload_images/325120-2820ae9fa9af34e6.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/800)

![](http://upload-images.jianshu.io/upload_images/325120-ff573111c3a560c4.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/800)

![](http://upload-images.jianshu.io/upload_images/325120-d8f0c39162602a8f.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/800)

##8、事务的提交Service

![.png](http://upload-images.jianshu.io/upload_images/325120-e0d88be7c0466ab0.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/800)


![](http://upload-images.jianshu.io/upload_images/325120-87ef98427c62f8bc.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/800)


![](http://upload-images.jianshu.io/upload_images/325120-bc57a96d0158cfda.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/800)


