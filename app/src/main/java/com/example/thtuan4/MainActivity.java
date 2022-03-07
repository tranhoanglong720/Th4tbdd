package com.example.thtuan4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Bundle;
import android.widget.ListView;
import com.example.thtuan4.R;
import com.example.thtuan4.adapter.LanguageAdapter;
import com.example.thtuan4.model.Language;
import java.util.ArrayList;
import java.util.List;
public class MainActivity extends AppCompatActivity {
    private List<Language> listLanguage;

    private ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.idListView);
        listLanguage = new ArrayList<>();
        listLanguage.add(new Language(1, "Ca nau lau,nau mì mini","Shop Devang"));
        listLanguage.add(new Language(2, "1Kg Khô gà bơ tỏi..","Shop LTDFood"));
        listLanguage.add(new Language(3, "Xe cần cẩu đa năng","Shop thế giớ đồ chơi"));
        listLanguage.add(new Language(4, "Đổ chơi dạng mô hình","Shop thế giớ đồ chơi"));
        listLanguage.add(new Language(5, "Lãnh đạo đơn giản","Shop MinhLongBook"));
        listLanguage.add(new Language(6, "Hiểu lòng trẻ con","Shop MinhLongBook"));
        listLanguage.add(new Language(7, "DonalTrump Thiên tài lảnh đạo","Shop MinhLongBook"));
        LanguageAdapter adapter = new LanguageAdapter(this, R.layout.item_list, listLanguage);
        listView.setAdapter(adapter);
    }
}