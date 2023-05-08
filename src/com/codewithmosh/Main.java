package com.codewithmosh;

import com.codewithmosh.command.AddCustomerCommand;
import com.codewithmosh.command.BlackAndWhiteCommand;
import com.codewithmosh.command.CustomerService;
import com.codewithmosh.command.ResizeCommand;
import com.codewithmosh.command.fx.Button;
import com.codewithmosh.command.fx.CompositeCommand;

public class Main {
    public static void main(String[] args) {
        var composite = new CompositeCommand();
        composite.add(new ResizeCommand());
        composite.add(new BlackAndWhiteCommand());
        composite.execute();
    }

}