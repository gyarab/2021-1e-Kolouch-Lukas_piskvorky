package com.example.piskvorky;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.text.Text;

import java.net.URL;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.ResourceBundle;


public class HelloController implements Initializable {

    @FXML
    private Text winnertext;

    @FXML
    private Button button1;

    @FXML
    private Button button2;

    @FXML
    private Button button3;

    @FXML
    private Button button4;

    @FXML
    private Button button5;

    @FXML
    private Button button6;

    @FXML
    private Button button7;

    @FXML
    private Button button8;

    @FXML
    private Button button9;

    @FXML
    private Button button10;

    @FXML
    private Button button11;

    @FXML
    private Button button12;

    @FXML
    private Button button13;

    @FXML
    private Button button14;

    @FXML
    private Button button15;

    @FXML
    private Button button16;

    @FXML
    private Button button17;

    @FXML
    private Button button18;

    @FXML
    private Button button19;

    @FXML
    private Button button20;

    @FXML
    private Button button21;

    @FXML
    private Button button22;

    @FXML
    private Button button23;

    @FXML
    private Button button24;

    @FXML
    private Button button25;

    @FXML
    private Button button26;

    @FXML
    private Button button27;

    @FXML
    private Button button28;

    @FXML
    private Button button29;

    @FXML
    private Button button30;

    @FXML
    private Button button31;

    @FXML
    private Button button32;

    @FXML
    private Button button33;

    @FXML
    private Button button34;

    @FXML
    private Button button35;

    @FXML
    private Button button36;

    @FXML
    private Button button37;

    @FXML
    private Button button38;

    @FXML
    private Button button39;

    @FXML
    private Button button40;

    @FXML
    private Button button41;

    @FXML
    private Button button42;

    @FXML
    private Button button43;

    @FXML
    private Button button44;

    @FXML
    private Button button45;

    @FXML
    private Button button46;

    @FXML
    private Button button47;

    @FXML
    private Button button48;

    @FXML
    private Button button49;

    @FXML
    private Button button50;

    @FXML
    private Button button51;

    @FXML
    private Button button52;

    @FXML
    private Button button53;

    @FXML
    private Button button54;

    @FXML
    private Button button55;

    @FXML
    private Button button56;

    @FXML
    private Button button57;

    @FXML
    private Button button58;

    @FXML
    private Button button59;

    @FXML
    private Button button60;

    @FXML
    private Button button61;

    @FXML
    private Button button62;

    @FXML
    private Button button63;

    @FXML
    private Button button64;

    @FXML
    private Button button65;

    @FXML
    private Button button66;

    @FXML
    private Button button67;

    @FXML
    private Button button68;

    @FXML
    private Button button69;

    @FXML
    private Button button70;

    @FXML
    private Button button71;

    @FXML
    private Button button72;

    @FXML
    private Button button73;

    @FXML
    private Button button74;

    @FXML
    private Button button75;

    @FXML
    private Button button76;

    @FXML
    private Button button77;

    @FXML
    private Button button78;

    @FXML
    private Button button79;

    @FXML
    private Button button80;

    @FXML
    private Button button81;

    @FXML
    private Button button82;

    @FXML
    private Button button83;

    @FXML
    private Button button84;

    @FXML
    private Button button85;

    @FXML
    private Button button86;

    @FXML
    private Button button87;

    @FXML
    private Button button88;

    @FXML
    private Button button89;

    @FXML
    private Button button90;

    @FXML
    private Button button91;

    @FXML
    private Button button92;

    @FXML
    private Button button93;

    @FXML
    private Button button94;

    @FXML
    private Button button95;

    @FXML
    private Button button96;

    @FXML
    private Button button97;

    @FXML
    private Button button98;

    @FXML
    private Button button99;

    @FXML
    private Button button100;

    @FXML
    private Label kdohraje;

    private int tahHrace = 0;

    ArrayList<Button> buttons;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        buttons = new ArrayList<>(Arrays.asList(button1, button2,button3, button4, button5, button6, button7, button8, button9, button10, button11, button12, button13, button14,
                button15, button16, button17, button18, button19, button20, button21, button22, button23, button24, button25, button26, button27, button28, button29, button30, button31,
                button32, button33, button34, button35, button36, button37, button38, button39, button40, button41, button42, button43, button44, button45, button46, button47, button48,
                button49, button50, button51, button52, button53, button54, button55, button56, button57, button58, button59, button60, button61, button62, button63, button64, button65,
                button66, button67, button68, button69, button70, button71, button72, button73, button74, button75, button76, button77, button78, button79, button80, button81, button82,
                button83, button84, button85, button86, button87, button88, button89, button90, button91, button92, button93, button94, button95, button96, button97, button98,
                button99, button100));
        buttons.forEach(tlacitko ->{
            vytvorenitalcitek(tlacitko);
            tlacitko.setFocusTraversable(false);
        });
        kdohraje.setStyle("-fx-background-color: #47e0f5; ");
    }

    private void vytvorenitalcitek(Button button) {
        button.setOnMouseClicked(mouseEvent -> {
            nastavitZnakHrace(button);
            button.setDisable(true);
            zkontrolujKonecHry();
        });
    }

    public void nastavitZnakHrace(Button tlacitko){
        if (tahHrace % 2 == 0) {
            tlacitko.setText("X");
            tlacitko.setStyle("-fx-background-color: #47e0f5; ");
            kdohraje.setText("Hraje O");
            kdohraje.setStyle("-fx-background-color: #ecf547; ");
            tahHrace = 1;
        }
        else {
            tlacitko.setText("O");
            tlacitko.setStyle("-fx-background-color: #ecf547; ");
            kdohraje.setText("Hraje X");
            kdohraje.setStyle("-fx-background-color: #47e0f5; ");
            tahHrace = 0;
        }
    }

    @FXML
    void restartHry(ActionEvent event) {
        buttons.forEach(this::resetTlacitek);
    }

    public void resetTlacitek(Button tlacitko) {
        tlacitko.setDisable(false);
        tlacitko.setText("");
        tlacitko.setStyle("-fx-backround-color: #000000; ");
        winnertext.setText("Piškvorky");
        tahHrace = 0;
        kdohraje.setStyle("-fx-background-color: #47e0f5; ");
        kdohraje.setText("Hraje X");
    }

    public void zkontrolujKonecHry(){
        for (int x = 0; x < 238; x ++) {
            String line = switch (x) {

                //horizontálně

                //h1
                case 0 -> button1.getText() + button2.getText() + button3.getText() + button4.getText();
                case 1 -> button2.getText() + button3.getText() + button4.getText() + button5.getText();
                case 2 -> button3.getText() + button4.getText() + button5.getText() + button6.getText();
                case 3 -> button4.getText() + button5.getText() + button6.getText() + button7.getText();
                case 4 -> button5.getText() + button6.getText() + button7.getText() + button8.getText();
                case 5 -> button6.getText() + button7.getText() + button8.getText() + button9.getText();
                case 6 -> button7.getText() + button8.getText() + button9.getText() + button10.getText();

                //h2
                case 7 -> button11.getText() + button12.getText() + button13.getText() + button14.getText();
                case 8 -> button12.getText() + button13.getText() + button14.getText() + button15.getText();
                case 9 -> button13.getText() + button14.getText() + button15.getText() + button16.getText();
                case 10 -> button14.getText() + button15.getText() + button16.getText() + button17.getText();
                case 11 -> button15.getText() + button16.getText() + button17.getText() + button18.getText();
                case 12 -> button16.getText() + button17.getText() + button18.getText() + button19.getText();
                case 13 -> button17.getText() + button18.getText() + button19.getText() + button20.getText();

                //h3
                case 14 -> button21.getText() + button22.getText() + button23.getText() + button24.getText();
                case 15 -> button22.getText() + button23.getText() + button24.getText() + button25.getText();
                case 16 -> button23.getText() + button24.getText() + button25.getText() + button26.getText();
                case 17 -> button24.getText() + button25.getText() + button26.getText() + button27.getText();
                case 18 -> button25.getText() + button26.getText() + button27.getText() + button28.getText();
                case 19 -> button26.getText() + button27.getText() + button28.getText() + button29.getText();
                case 20 -> button27.getText() + button28.getText() + button29.getText() + button30.getText();

                //h4
                case 21 -> button31.getText() + button32.getText() + button33.getText() + button34.getText();
                case 22 -> button32.getText() + button33.getText() + button34.getText() + button35.getText();
                case 23 -> button33.getText() + button34.getText() + button35.getText() + button36.getText();
                case 24 -> button34.getText() + button35.getText() + button36.getText() + button37.getText();
                case 25 -> button35.getText() + button36.getText() + button37.getText() + button38.getText();
                case 26 -> button36.getText() + button37.getText() + button38.getText() + button39.getText();
                case 27 -> button37.getText() + button38.getText() + button39.getText() + button40.getText();

                //h5
                case 28 -> button41.getText() + button42.getText() + button43.getText() + button44.getText();
                case 29 -> button42.getText() + button43.getText() + button44.getText() + button45.getText();
                case 30 -> button43.getText() + button44.getText() + button45.getText() + button46.getText();
                case 31 -> button44.getText() + button45.getText() + button46.getText() + button47.getText();
                case 32 -> button45.getText() + button46.getText() + button47.getText() + button48.getText();
                case 33 -> button46.getText() + button47.getText() + button48.getText() + button49.getText();
                case 34 -> button47.getText() + button48.getText() + button49.getText() + button40.getText();

                //h6
                case 35 -> button51.getText() + button52.getText() + button53.getText() + button54.getText();
                case 36 -> button52.getText() + button53.getText() + button54.getText() + button55.getText();
                case 37 -> button53.getText() + button54.getText() + button55.getText() + button56.getText();
                case 38 -> button54.getText() + button55.getText() + button56.getText() + button57.getText();
                case 39 -> button55.getText() + button56.getText() + button57.getText() + button58.getText();
                case 40 -> button56.getText() + button57.getText() + button58.getText() + button59.getText();
                case 41 -> button57.getText() + button58.getText() + button59.getText() + button60.getText();

                //h7
                case 42 -> button61.getText() + button62.getText() + button63.getText() + button64.getText();
                case 43 -> button62.getText() + button63.getText() + button64.getText() + button65.getText();
                case 44 -> button63.getText() + button64.getText() + button65.getText() + button66.getText();
                case 45 -> button64.getText() + button65.getText() + button66.getText() + button67.getText();
                case 46 -> button65.getText() + button66.getText() + button67.getText() + button68.getText();
                case 47 -> button66.getText() + button67.getText() + button68.getText() + button69.getText();
                case 48 -> button67.getText() + button68.getText() + button69.getText() + button70.getText();

                //h8
                case 49 -> button71.getText() + button72.getText() + button73.getText() + button74.getText();
                case 50 -> button72.getText() + button73.getText() + button74.getText() + button75.getText();
                case 51 -> button73.getText() + button74.getText() + button75.getText() + button76.getText();
                case 52 -> button74.getText() + button75.getText() + button76.getText() + button77.getText();
                case 53 -> button75.getText() + button76.getText() + button77.getText() + button78.getText();
                case 54 -> button76.getText() + button77.getText() + button78.getText() + button79.getText();
                case 55 -> button77.getText() + button78.getText() + button79.getText() + button80.getText();

                //h9
                case 56 -> button81.getText() + button82.getText() + button83.getText() + button84.getText();
                case 57 -> button82.getText() + button83.getText() + button84.getText() + button85.getText();
                case 58 -> button83.getText() + button84.getText() + button85.getText() + button86.getText();
                case 59 -> button84.getText() + button85.getText() + button86.getText() + button87.getText();
                case 60 -> button85.getText() + button86.getText() + button87.getText() + button88.getText();
                case 61 -> button86.getText() + button87.getText() + button88.getText() + button89.getText();
                case 62 -> button87.getText() + button88.getText() + button89.getText() + button90.getText();

                //h10
                case 63 -> button91.getText() + button92.getText() + button93.getText() + button94.getText();
                case 64 -> button92.getText() + button93.getText() + button94.getText() + button95.getText();
                case 65 -> button93.getText() + button94.getText() + button95.getText() + button96.getText();
                case 66 -> button94.getText() + button95.getText() + button96.getText() + button97.getText();
                case 67 -> button95.getText() + button96.getText() + button97.getText() + button98.getText();
                case 68 -> button96.getText() + button97.getText() + button98.getText() + button99.getText();
                case 69 -> button97.getText() + button98.getText() + button99.getText() + button100.getText();

                //vertikálně

                //v1
                case 70 -> button1.getText() + button11.getText() + button21.getText() + button31.getText();
                case 71 -> button11.getText() + button21.getText() + button31.getText() + button41.getText();
                case 72 -> button21.getText() + button31.getText() + button41.getText() + button51.getText();
                case 73 -> button31.getText() + button41.getText() + button51.getText() + button61.getText();
                case 74 -> button41.getText() + button51.getText() + button61.getText() + button71.getText();
                case 75 -> button51.getText() + button61.getText() + button71.getText() + button81.getText();
                case 76 -> button61.getText() + button71.getText() + button81.getText() + button91.getText();

                //v2
                case 77 -> button2.getText() + button12.getText() + button22.getText() + button32.getText();
                case 78 -> button12.getText() + button22.getText() + button32.getText() + button42.getText();
                case 79 -> button22.getText() + button32.getText() + button42.getText() + button52.getText();
                case 80 -> button32.getText() + button42.getText() + button52.getText() + button62.getText();
                case 81 -> button42.getText() + button52.getText() + button62.getText() + button72.getText();
                case 82 -> button52.getText() + button62.getText() + button72.getText() + button82.getText();
                case 83 -> button62.getText() + button72.getText() + button82.getText() + button92.getText();

                //v3
                case 84 -> button3.getText() + button13.getText() + button23.getText() + button33.getText();
                case 85 -> button13.getText() + button23.getText() + button33.getText() + button43.getText();
                case 86 -> button23.getText() + button33.getText() + button43.getText() + button53.getText();
                case 87 -> button33.getText() + button43.getText() + button53.getText() + button63.getText();
                case 88 -> button43.getText() + button53.getText() + button63.getText() + button73.getText();
                case 89 -> button53.getText() + button63.getText() + button73.getText() + button83.getText();
                case 90 -> button63.getText() + button73.getText() + button83.getText() + button93.getText();

                //v4
                case 91 -> button4.getText() + button14.getText() + button24.getText() + button34.getText();
                case 92 -> button14.getText() + button24.getText() + button34.getText() + button44.getText();
                case 93 -> button24.getText() + button34.getText() + button44.getText() + button54.getText();
                case 94 -> button34.getText() + button44.getText() + button54.getText() + button64.getText();
                case 95 -> button44.getText() + button54.getText() + button64.getText() + button74.getText();
                case 96 -> button54.getText() + button64.getText() + button74.getText() + button84.getText();
                case 97 -> button64.getText() + button74.getText() + button84.getText() + button94.getText();

                //v5
                case 98 -> button5.getText() + button15.getText() + button25.getText() + button35.getText();
                case 99 -> button15.getText() + button25.getText() + button35.getText() + button45.getText();
                case 100 -> button25.getText() + button35.getText() + button45.getText() + button55.getText();
                case 101 -> button35.getText() + button45.getText() + button55.getText() + button65.getText();
                case 102 -> button45.getText() + button55.getText() + button65.getText() + button75.getText();
                case 103 -> button55.getText() + button65.getText() + button75.getText() + button85.getText();
                case 104 -> button65.getText() + button75.getText() + button85.getText() + button95.getText();

                //v6
                case 105 -> button6.getText() + button16.getText() + button26.getText() + button36.getText();
                case 106 -> button16.getText() + button26.getText() + button36.getText() + button46.getText();
                case 107 -> button26.getText() + button36.getText() + button46.getText() + button56.getText();
                case 108 -> button36.getText() + button46.getText() + button56.getText() + button66.getText();
                case 109 -> button46.getText() + button56.getText() + button66.getText() + button76.getText();
                case 110 -> button56.getText() + button66.getText() + button76.getText() + button86.getText();
                case 111 -> button66.getText() + button76.getText() + button86.getText() + button96.getText();

                //v7
                case 112 -> button7.getText() + button17.getText() + button27.getText() + button37.getText();
                case 113 -> button17.getText() + button27.getText() + button37.getText() + button47.getText();
                case 114 -> button27.getText() + button37.getText() + button47.getText() + button57.getText();
                case 115 -> button37.getText() + button47.getText() + button57.getText() + button67.getText();
                case 116 -> button47.getText() + button57.getText() + button67.getText() + button77.getText();
                case 117 -> button57.getText() + button67.getText() + button77.getText() + button87.getText();
                case 118 -> button67.getText() + button77.getText() + button87.getText() + button97.getText();

                //v8
                case 119 -> button8.getText() + button18.getText() + button28.getText() + button38.getText();
                case 120 -> button18.getText() + button28.getText() + button38.getText() + button48.getText();
                case 121 -> button28.getText() + button38.getText() + button48.getText() + button58.getText();
                case 122 -> button38.getText() + button48.getText() + button58.getText() + button68.getText();
                case 123 -> button48.getText() + button58.getText() + button68.getText() + button78.getText();
                case 124 -> button58.getText() + button68.getText() + button78.getText() + button88.getText();
                case 125 -> button68.getText() + button78.getText() + button88.getText() + button98.getText();

                //v9
                case 126 -> button9.getText() + button19.getText() + button29.getText() + button39.getText();
                case 127 -> button19.getText() + button29.getText() + button39.getText() + button49.getText();
                case 128 -> button29.getText() + button39.getText() + button49.getText() + button59.getText();
                case 129 -> button39.getText() + button49.getText() + button59.getText() + button69.getText();
                case 130 -> button49.getText() + button59.getText() + button69.getText() + button79.getText();
                case 131 -> button59.getText() + button69.getText() + button79.getText() + button89.getText();
                case 132 -> button69.getText() + button79.getText() + button89.getText() + button99.getText();

                //v10
                case 133 -> button10.getText() + button20.getText() + button30.getText() + button40.getText();
                case 134 -> button20.getText() + button30.getText() + button40.getText() + button50.getText();
                case 135 -> button30.getText() + button40.getText() + button50.getText() + button60.getText();
                case 136 -> button40.getText() + button50.getText() + button60.getText() + button70.getText();
                case 137 -> button50.getText() + button60.getText() + button70.getText() + button80.getText();
                case 138 -> button60.getText() + button70.getText() + button80.getText() + button90.getText();
                case 139 -> button70.getText() + button80.getText() + button90.getText() + button100.getText();

                /*diagonálně
                   <-\
                        \->
                 */

                //vrchol 1.s
                case 140 -> button1.getText() + button12.getText() + button23.getText() + button34.getText();
                case 141 -> button11.getText() + button22.getText() + button33.getText() + button44.getText();
                case 142 -> button21.getText() + button32.getText() + button43.getText() + button54.getText();
                case 143 -> button31.getText() + button42.getText() + button53.getText() + button64.getText();
                case 144 -> button41.getText() + button52.getText() + button63.getText() + button74.getText();
                case 145 -> button51.getText() + button62.getText() + button73.getText() + button84.getText();
                case 146 -> button61.getText() + button72.getText() + button83.getText() + button94.getText();

                //vrchol 2.s
                case 147 -> button2.getText() + button13.getText() + button24.getText() + button35.getText();
                case 148 -> button12.getText() + button23.getText() + button34.getText() + button45.getText();
                case 149 -> button22.getText() + button33.getText() + button44.getText() + button55.getText();
                case 150 -> button32.getText() + button43.getText() + button54.getText() + button65.getText();
                case 151 -> button42.getText() + button53.getText() + button64.getText() + button75.getText();
                case 152 -> button52.getText() + button63.getText() + button74.getText() + button85.getText();
                case 153 -> button62.getText() + button73.getText() + button84.getText() + button95.getText();

                //vrchol 3.s
                case 154 -> button3.getText() + button14.getText() + button25.getText() + button36.getText();
                case 155 -> button13.getText() + button24.getText() + button35.getText() + button46.getText();
                case 156 -> button23.getText() + button34.getText() + button45.getText() + button56.getText();
                case 157 -> button33.getText() + button44.getText() + button55.getText() + button66.getText();
                case 158 -> button43.getText() + button54.getText() + button65.getText() + button76.getText();
                case 159 -> button53.getText() + button64.getText() + button75.getText() + button86.getText();
                case 160 -> button63.getText() + button74.getText() + button85.getText() + button96.getText();

                //vrchol 4.s
                case 161 -> button4.getText() + button15.getText() + button26.getText() + button37.getText();
                case 162 -> button14.getText() + button25.getText() + button36.getText() + button47.getText();
                case 163 -> button24.getText() + button35.getText() + button46.getText() + button57.getText();
                case 164 -> button34.getText() + button45.getText() + button56.getText() + button67.getText();
                case 165 -> button44.getText() + button55.getText() + button66.getText() + button77.getText();
                case 166 -> button54.getText() + button65.getText() + button76.getText() + button87.getText();
                case 167 -> button64.getText() + button75.getText() + button86.getText() + button97.getText();

                //vrchol 5.s
                case 168 -> button5.getText() + button16.getText() + button27.getText() + button38.getText();
                case 169 -> button15.getText() + button26.getText() + button37.getText() + button48.getText();
                case 170 -> button25.getText() + button36.getText() + button47.getText() + button58.getText();
                case 171 -> button35.getText() + button46.getText() + button57.getText() + button68.getText();
                case 172 -> button45.getText() + button56.getText() + button67.getText() + button78.getText();
                case 173 -> button55.getText() + button66.getText() + button77.getText() + button88.getText();
                case 174 -> button65.getText() + button76.getText() + button87.getText() + button98.getText();

                //vrchol 6.s
                case 175 -> button6.getText() + button17.getText() + button28.getText() + button39.getText();
                case 176 -> button16.getText() + button27.getText() + button38.getText() + button49.getText();
                case 177 -> button26.getText() + button37.getText() + button48.getText() + button59.getText();
                case 178 -> button36.getText() + button47.getText() + button58.getText() + button69.getText();
                case 179 -> button46.getText() + button57.getText() + button68.getText() + button79.getText();
                case 180 -> button56.getText() + button67.getText() + button78.getText() + button89.getText();
                case 181 -> button66.getText() + button77.getText() + button88.getText() + button99.getText();

                //vrchol 7.s
                case 182 -> button7.getText() + button18.getText() + button29.getText() + button40.getText();
                case 183 -> button17.getText() + button28.getText() + button39.getText() + button50.getText();
                case 184 -> button27.getText() + button38.getText() + button49.getText() + button60.getText();
                case 185 -> button37.getText() + button48.getText() + button59.getText() + button70.getText();
                case 186 -> button47.getText() + button58.getText() + button69.getText() + button80.getText();
                case 187 -> button57.getText() + button68.getText() + button79.getText() + button90.getText();
                case 188 -> button67.getText() + button78.getText() + button89.getText() + button100.getText();

                /*diagonálně
                            /->
                       <-/
                 */

                //vrchol 10.s
                case 189 -> button10.getText() + button19.getText() + button28.getText() + button37.getText();
                case 190 -> button20.getText() + button29.getText() + button38.getText() + button47.getText();
                case 191 -> button30.getText() + button39.getText() + button48.getText() + button57.getText();
                case 192 -> button40.getText() + button49.getText() + button58.getText() + button67.getText();
                case 193 -> button50.getText() + button59.getText() + button68.getText() + button77.getText();
                case 194 -> button60.getText() + button69.getText() + button78.getText() + button87.getText();
                case 195 -> button70.getText() + button79.getText() + button88.getText() + button97.getText();

                //vrchol 9.s
                case 196 -> button9.getText() + button18.getText() + button27.getText() + button36.getText();
                case 197 -> button19.getText() + button28.getText() + button37.getText() + button46.getText();
                case 198 -> button29.getText() + button38.getText() + button47.getText() + button56.getText();
                case 199 -> button39.getText() + button48.getText() + button57.getText() + button66.getText();
                case 200 -> button49.getText() + button58.getText() + button67.getText() + button76.getText();
                case 201 -> button59.getText() + button68.getText() + button77.getText() + button86.getText();
                case 202 -> button69.getText() + button78.getText() + button87.getText() + button96.getText();

                //vrchol 8.s
                case 203 -> button8.getText() + button17.getText() + button26.getText() + button35.getText();
                case 204 -> button18.getText() + button27.getText() + button36.getText() + button45.getText();
                case 205 -> button28.getText() + button37.getText() + button46.getText() + button55.getText();
                case 206 -> button38.getText() + button47.getText() + button56.getText() + button65.getText();
                case 207 -> button48.getText() + button57.getText() + button66.getText() + button75.getText();
                case 208 -> button58.getText() + button67.getText() + button76.getText() + button85.getText();
                case 209 -> button68.getText() + button77.getText() + button86.getText() + button95.getText();

                //vrchol 7.s
                case 210 -> button7.getText() + button16.getText() + button25.getText() + button34.getText();
                case 211 -> button17.getText() + button26.getText() + button35.getText() + button44.getText();
                case 212 -> button27.getText() + button36.getText() + button45.getText() + button54.getText();
                case 213 -> button37.getText() + button46.getText() + button55.getText() + button64.getText();
                case 214 -> button47.getText() + button56.getText() + button65.getText() + button74.getText();
                case 215 -> button57.getText() + button66.getText() + button75.getText() + button84.getText();
                case 216 -> button67.getText() + button76.getText() + button85.getText() + button94.getText();

                //vrchol 6.s
                case 217 -> button6.getText() + button15.getText() + button24.getText() + button33.getText();
                case 218 -> button16.getText() + button25.getText() + button34.getText() + button43.getText();
                case 219 -> button26.getText() + button35.getText() + button44.getText() + button53.getText();
                case 220 -> button36.getText() + button45.getText() + button54.getText() + button63.getText();
                case 221 -> button46.getText() + button55.getText() + button64.getText() + button73.getText();
                case 222 -> button56.getText() + button65.getText() + button74.getText() + button83.getText();
                case 223 -> button66.getText() + button75.getText() + button84.getText() + button93.getText();

                //vrchol 5.s
                case 224 -> button5.getText() + button14.getText() + button23.getText() + button32.getText();
                case 225 -> button15.getText() + button24.getText() + button33.getText() + button42.getText();
                case 226 -> button25.getText() + button34.getText() + button43.getText() + button52.getText();
                case 227 -> button35.getText() + button44.getText() + button53.getText() + button62.getText();
                case 228 -> button45.getText() + button54.getText() + button63.getText() + button72.getText();
                case 229 -> button55.getText() + button64.getText() + button73.getText() + button82.getText();
                case 230 -> button65.getText() + button74.getText() + button83.getText() + button92.getText();

                //vrchol 4.s
                case 231 -> button4.getText() + button13.getText() + button22.getText() + button31.getText();
                case 232 -> button14.getText() + button23.getText() + button32.getText() + button41.getText();
                case 233 -> button24.getText() + button33.getText() + button42.getText() + button51.getText();
                case 234 -> button34.getText() + button43.getText() + button52.getText() + button61.getText();
                case 235 -> button44.getText() + button53.getText() + button62.getText() + button71.getText();
                case 236 -> button54.getText() + button63.getText() + button72.getText() + button81.getText();
                case 237 -> button64.getText() + button73.getText() + button82.getText() + button91.getText();

                default -> null;
            };

            //O vyhraje
            if (line.equals("OOOO")) {
                winnertext.setText("O vyhrálo");
                kdohraje.setText(" ");
                kdohraje.setStyle("-fx-backround-color: #000000; ");
                return;
            }
            //X vyhraje
            else if (line.equals("XXXX")) {
                winnertext.setText("X vyhrál");
                kdohraje.setText(" ");
                kdohraje.setStyle("-fx-backround-color: #000000; ");
                return;
            }

        }
    }
}
