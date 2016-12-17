package com.example.cristianverdes.mystackexchange;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

/**
 * Created by Cristian Verdes on 11/29/2016.
 */

public class ViewQuestionActivity extends AppCompatActivity {
    private TextView title;
    private TextView user;
    private TextView rate;
    private TextView answers;
    private String answersModel = "Augustus (Latin: Imperātor Caesar Dīvī Fīlius Augustus;[note 1][note 2] 23 September 63 BC – 19 August 14 AD) was the founder of the Roman Empire and its first Emperor, ruling from 27 BC until his death in AD 14.[note 3]\n" +
            "\n" +
            "He was born Gaius Octavius into an old and wealthy equestrian branch of the plebeian Octavii family. His maternal great-uncle Julius Caesar was assassinated in 44 BC, and Octavius was named in Caesar's will as his adopted son and heir, then known as Octavianus (Anglicized as Octavian). He, Mark Antony, and Marcus Lepidus formed the Second Triumvirate to defeat the assassins of Caesar. Following their victory at Philippi, the Triumvirate divided the Roman Republic among themselves and ruled as military dictators.[note 4] The Triumvirate was eventually torn apart under the competing ambitions of its members. Lepidus was driven into exile and stripped of his position, and Antony committed suicide following his defeat at the Battle of Actium by Octavian in 31 BC.\n" +
            "\n" +
            "After the demise of the Second Triumvirate, Augustus restored the outward façade of the free Republic, with governmental power vested in the Roman Senate, the executive magistrates, and the legislative assemblies. In reality, however, he retained his autocratic power over the Republic as a military dictator. By law, Augustus held a collection of powers granted to him for life by the Senate, including supreme military command, and those of tribune and censor. It took several years for Augustus to develop the framework within which a formally republican state could be led under his sole rule. He rejected monarchical titles, and instead called himself Princeps Civitatis (\"First Citizen of the State\"). The resulting constitutional framework became known as the Principate, the first phase of the Roman Empire.\n" +
            "\n" +
            "The reign of Augustus initiated an era of relative peace known as the Pax Romana (The Roman Peace). The Roman world was largely free from large-scale conflict for more than two centuries, despite continuous wars of imperial expansion on the Empire's frontiers and one year-long civil war over the imperial succession. Augustus dramatically enlarged the Empire, annexing Egypt, Dalmatia, Pannonia, Noricum, and Raetia; expanding possessions in Africa; expanding into Germania; and completing the conquest of Hispania.\n" +
            "\n" +
            "Beyond the frontiers, he secured the Empire with a buffer region of client states and made peace with the Parthian Empire through diplomacy. He reformed the Roman system of taxation, developed networks of roads with an official courier system, established a standing army, established the Praetorian Guard, created official police and fire-fighting services for Rome, and rebuilt much of the city during his reign.\n" +
            "\n" +
            "Augustus died in AD 14 at the age of 75. He may have died from natural causes, although there were unconfirmed rumors that his wife Livia poisoned him. He was succeeded as Emperor by his adopted son (also stepson and former son-in-law) Tiberius.";

    public static void start(Context context) {
        Intent starter = new Intent(context, ViewQuestionActivity.class);
        context.startActivity(starter);
    }

    @Override
    public void onCreate(Bundle savedInstanteState){
        super.onCreate(savedInstanteState);
        setContentView(R.layout.activity_view_question);

        title = (TextView) findViewById(R.id.title);
        user = (TextView) findViewById(R.id.user);
        rate = (TextView) findViewById(R.id.rate);
        answers = (TextView) findViewById(R.id.answers);

        answers.setText(answersModel);
        answers.setMovementMethod(new ScrollingMovementMethod());

    }
}
