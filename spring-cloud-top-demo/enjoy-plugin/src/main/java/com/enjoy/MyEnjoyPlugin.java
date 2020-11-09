package com.enjoy;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;

/**
 * @Author: lanyong_csd
 * @Create: 2019/10/13 21:26
 * @Company: Si-tech
 * @Description:
 **/
@Mojo(name = "log",defaultPhase = LifecyclePhase.PACKAGE)
public class MyEnjoyPlugin extends AbstractMojo {
    @Parameter(property = "name",defaultValue = "lanyong_csd")
    private Object nm;

    @Override
    public void execute() throws MojoExecutionException, MojoFailureException {
        getLog().info("hello"+nm+",demploy to you");
    }
}
