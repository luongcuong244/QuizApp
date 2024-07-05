package com.azamovhudstc.quizapp.adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.azamovhudstc.quizapp.R;
import com.azamovhudstc.quizapp.model.Question;
import com.azamovhudstc.quizapp.model.QuestionCategory;
import com.azamovhudstc.quizapp.ui.QuizActivity;
import com.azamovhudstc.quizapp.ui.QuizOptionActivity;
import com.azamovhudstc.quizapp.util.Constants;

public class QuizOptionAdapter extends RecyclerView.Adapter<QuizOptionAdapter.QuizOptionViewHolder> {

    private Context context;

    public QuizOptionAdapter(Context context) {
        this.context = context;
    }

    @Override
    public QuizOptionViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new QuizOptionViewHolder(LayoutInflater.from(context).inflate(R.layout.item_subject_category, parent, false));
    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onBindViewHolder(QuizOptionViewHolder holder, int position) {
        QuestionCategory item = QuestionCategory.values()[position];
        holder.imageView.setImageResource(item.getImageRes());
        holder.txtSubjectName.setText(item.getSubjectName());
        holder.txtQuestionCount.setText(Question.countQuestions(item) + " câu hỏi");

        holder.rootLayout.setOnClickListener(view -> {
            Intent intent = new Intent(context, QuizActivity.class);
            intent.putExtra(Constants.SUBJECT, item.getSubjectName());
            context.startActivity(intent);
        });
    }

    @Override
    public int getItemCount() {
        return QuestionCategory.values().length;
    }

    public class QuizOptionViewHolder extends RecyclerView.ViewHolder {

        LinearLayout rootLayout;
        ImageView imageView;
        TextView txtSubjectName;
        TextView txtQuestionCount;

        public QuizOptionViewHolder(View itemView) {
            super(itemView);
            rootLayout = itemView.findViewById(R.id.root);
            imageView = itemView.findViewById(R.id.imageView);
            txtSubjectName = itemView.findViewById(R.id.txt_subject_name);
            txtQuestionCount = itemView.findViewById(R.id.txt_question_count);
        }
    }
}
